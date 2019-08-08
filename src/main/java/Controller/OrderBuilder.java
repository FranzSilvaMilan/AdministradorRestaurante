/*******************************************************************************
 *
 *  * @(#)Order.java
 *  *
 *  * Copyright (c) 2018 Jala Foundation.
 *  * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 *  * All rights reserved.
 *  *
 *  * This software is the confidential and proprietary information of
 *  * Jala Foundation, ("Confidential Information").  You shall not
 *  * disclose such Confidential Information and shall use it only in
 *  * accordance with the terms of the license agreement you entered into
 *  * with Jala Foundation.
 *
 ******************************************************************************/

package Controller;

public class OrderBuilder implements IBuilder {

    @Override
    public Order buildOrder() {
        //order.setFileName("my path on order");
        return null;
    }


    /**public OrderBuilder() {
        order = new Order();
    }*/

    /**@Override
    public void buildSimpleOrder(String path, String fileName, boolean hidden, Long size, String operator, String unitForSize) {
        if (!path.isEmpty()) {
            order.setPath(path);
        }
        if (!fileName.isEmpty()) {
            order.setFileName(fileName);
        }
        if (hidden) {
            order.setIshidden(hidden);
        }
        order.setSize(size);
        order.setOperator(operator);
        order.setUnitForSize(unitForSize);
    }

    @Override
    public void buildMediumOrder(boolean directory, boolean readOnly,
                                 Date dateModifyFrom, Date dateModifyTo, Date dateCreateFrom,
                                 Date dateCreateTo, Date dateAccessFrom, Date dateAccessTo,
                                 boolean keysensitive, String owner, String contain, ArrayList<String> extensions,
                                 boolean endWith, boolean startWith, boolean multimediaSelected, boolean dateCreate,
                                 boolean dateModified, boolean dateLassAccess) {

        if (directory) order.setDirectory(directory);
        if (endWith) order.setEndWith(endWith);
        if (dateCreate) order.setEnableCreate(dateCreate);
        if (dateModified) order.setEnableModified(dateModified);
        if (dateLassAccess) order.setEnableLastAccess(dateLassAccess);
        if (startWith) order.setStartWith(startWith);
        if (readOnly) order.setReadOnly(readOnly);
        if (dateModifyFrom != null) order.setDateModificateFrom(dateModifyFrom);
        if (dateModifyTo != null) order.setDateModificateTo(dateModifyTo);
        if (dateCreateFrom != null) order.setDateCreateFrom(dateCreateFrom);
        if (dateCreateTo != null) order.setDateCreateTo(dateCreateTo);
        if (dateAccessFrom != null) order.setDateAccessFrom(dateAccessFrom);
        if (dateAccessTo != null) order.setDateAccessTo(dateAccessTo);
        if (keysensitive) order.setKeySensitive(keysensitive);
        if (!owner.isEmpty()) order.setOwner(owner);
        if (!contain.isEmpty()) order.setContent(contain);
        if (!extensions.isEmpty()) order.setListExtensions(extensions);
        if (multimediaSelected) {
            order.setMultimediaSelected(multimediaSelected);
        }

    }

    @Override
    public void buildAdvanzedOrder(String frameRare, String videoCode, String audioCode, String resolution, double duration,
                                   String operatorDurationTime, String unitTime , ArrayList<String> extensionVideo, String aspectRatio) {
        System.out.println("buildea multimedia");
        if (frameRare != null) {
            order.setFrameRate(frameRare);
        }
        if (videoCode != null) {
            order.setVideoCode(videoCode);
        }
        if (audioCode != null) {
            order.setAudioCode(audioCode);
        }
        if (resolution != null) {
            order.setResolution(resolution);
        }
        if (duration >= 0) {
            order.setDuration(duration);
        }
        if (operatorDurationTime != null) {
            order.setOperatorDurationTime(operatorDurationTime);
        }
        if (!extensionVideo.isEmpty()) {
            System.out.println(" setea extensions");
            order.setExtensionVideo(extensionVideo);
        }
        if (aspectRatio != null) {
            order.setAspectRatio(aspectRatio);
        }
        order.setUnitTime(unitTime);

    }**/
}
