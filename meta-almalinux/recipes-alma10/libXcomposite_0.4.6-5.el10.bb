
inherit dnf-bridge

PN = "libXcomposite"
PE = "0"
PV = "0.4.6"
PR = "5.el10"
PACKAGES = "libXcomposite libXcomposite-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libXcomposite-0.4.6-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libXcomposite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXcomposite-0.4.6-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXcomposite}"
RDEPENDS:libXcomposite = " \
 glibc \
 libX11 \
"

URI_libXcomposite-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXcomposite-devel-0.4.6-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libXcomposite-devel}"
RDEPENDS:libXcomposite-devel = " \
 libXfixes-devel \
 pkgconf-pkg-config \
 libX11-devel \
 xorg-x11-proto-devel \
 libXcomposite \
"
