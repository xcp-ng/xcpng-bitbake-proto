
inherit dnf-bridge

PN = "x3270"
PE = "0"
PV = "4.3ga8"
PR = "8.el10"
PACKAGES = "x3270 x3270-text x3270-x11"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/x3270-4.3ga8-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_x3270 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/x3270-4.3ga8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_x3270}"
RDEPENDS:x3270 = " \
 openssl-libs \
 readline \
 bash \
 ncurses-libs \
 glibc \
"

URI_x3270-text = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/x3270-text-4.3ga8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_x3270-text}"
RDEPENDS:x3270-text = " \
 openssl-libs \
 readline \
 ncurses-libs \
 glibc \
 x3270 \
"

URI_x3270-x11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/x3270-x11-4.3ga8-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_x3270-x11}"
RDEPENDS:x3270-x11 = " \
 x3270 \
 libXmu \
 openssl-libs \
 libX11 \
 libXt \
 bash \
 libXaw \
 glibc \
 xrdb \
"
