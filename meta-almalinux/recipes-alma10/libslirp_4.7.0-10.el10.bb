
inherit dnf-bridge

PN = "libslirp"
PE = "0"
PV = "4.7.0"
PR = "10.el10"
PACKAGES = "libslirp libslirp-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libslirp-4.7.0-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libslirp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libslirp-4.7.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libslirp}"
RDEPENDS:libslirp = " \
 glibc \
 glib2 \
"

URI_libslirp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libslirp-devel-4.7.0-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libslirp-devel}"
RDEPENDS:libslirp-devel = " \
 libslirp \
 glib2-devel \
 pkgconf-pkg-config \
"
