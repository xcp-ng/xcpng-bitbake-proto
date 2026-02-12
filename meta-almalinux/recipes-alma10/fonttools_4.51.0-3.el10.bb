
inherit dnf-bridge

PN = "fonttools"
PE = "0"
PV = "4.51.0"
PR = "3.el10"
PACKAGES = "fonttools python3-fonttools"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/fonttools-4.51.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fonttools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fonttools-4.51.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fonttools}"
RDEPENDS:fonttools = " \
 python3 \
 python3-fonttools \
 python3-setuptools \
"

URI_python3-fonttools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-fonttools-4.51.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-fonttools}"
RDEPENDS:python3-fonttools = " \
 python3 \
 python3-fs \
 python3-scipy \
 python3-brotli \
 python3-lxml \
 glibc \
"
