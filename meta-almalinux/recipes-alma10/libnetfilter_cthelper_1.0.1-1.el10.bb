
inherit dnf-bridge

PN = "libnetfilter_cthelper"
PE = "0"
PV = "1.0.1"
PR = "1.el10"
PACKAGES = "libnetfilter_cthelper libnetfilter_cthelper-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libnetfilter_cthelper-1.0.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libnetfilter_cthelper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnetfilter_cthelper-1.0.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnetfilter_cthelper}"
RDEPENDS:libnetfilter_cthelper = " \
 glibc \
 libmnl \
"

URI_libnetfilter_cthelper-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnetfilter_cthelper-devel-1.0.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libnetfilter_cthelper-devel}"
RDEPENDS:libnetfilter_cthelper-devel = " \
 libnetfilter_cthelper \
 kernel-headers \
 pkgconf-pkg-config \
 libmnl-devel \
"
