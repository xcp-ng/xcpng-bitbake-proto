
inherit dnf-bridge

PN = "gstreamer1-plugins-ugly-free"
PE = "0"
PV = "1.24.11"
PR = "1.el10"
PACKAGES = "gstreamer1-plugins-ugly-free"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/gstreamer1-plugins-ugly-free-1.24.11-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gstreamer1-plugins-ugly-free = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-plugins-ugly-free-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gstreamer1-plugins-ugly-free}"
RDEPENDS:gstreamer1-plugins-ugly-free = " \
 libdvdread \
 gstreamer1 \
 gstreamer1-plugins-base \
 libmpeg2 \
 libcdio \
 glib2 \
 glibc \
 liba52 \
 orc \
"
