
inherit dnf-bridge

PN = "gstreamer1-rtsp-server"
PE = "0"
PV = "1.24.11"
PR = "1.el10"
PACKAGES = "gstreamer1-rtsp-server gstreamer1-rtsp-server-devel"


URI_gstreamer1-rtsp-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-rtsp-server-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-rtsp-server = " \
 glibc \
 gstreamer1-plugins-base \
 glib2 \
 gstreamer1 \
"

URI_gstreamer1-rtsp-server-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gstreamer1-rtsp-server-devel-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-rtsp-server-devel = " \
 gstreamer1 \
 gstreamer1-devel \
 pkgconf-pkg-config \
 gstreamer1-plugins-base \
 gstreamer1-plugins-base-devel \
 gstreamer1-rtsp-server \
 glib2 \
 glibc \
"
