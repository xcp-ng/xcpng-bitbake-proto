
PN = "gstreamer1"
PE = "0"
PV = "1.24.11"
PR = "1.el10"
PACKAGES = "gstreamer1 gstreamer1-devel"


URI_gstreamer1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1 = "
 python3
 libgcc
 libcap
 bash
 glib2
 glibc
"

URI_gstreamer1-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gstreamer1-devel-1.24.11-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gstreamer1-devel = "
 libxml2-devel
 glib2-devel
 check-devel
 gstreamer1
 gstreamer1-devel
 pkgconf-pkg-config
"
