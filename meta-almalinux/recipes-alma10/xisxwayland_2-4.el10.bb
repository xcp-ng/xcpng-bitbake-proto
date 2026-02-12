
inherit dnf-bridge

PN = "xisxwayland"
PE = "0"
PV = "2"
PR = "4.el10"
PACKAGES = "xisxwayland"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/xisxwayland-2-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xisxwayland = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xisxwayland-2-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xisxwayland}"
RDEPENDS:xisxwayland = " \
 glibc \
 libX11 \
 libXrandr \
"
