package win.lamit.butin.xmpp.jingle;

import win.lamit.butin.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	void onFileTransmitted(DownloadableFile file);

	void onFileTransferAborted();
}
