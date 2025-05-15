import express from 'express';
import { registerAdmin } from '../controller/adminController';
import { verifyToken } from '../middlewares/verifyToken';


const adminRouter = express.Router()

adminRouter.post("/admin",verifyToken,registerAdmin);

export default adminRouter;