
inherit dnf-bridge

PN = "maturin"
PE = "0"
PV = "1.4.0"
PR = "3.el10"
PACKAGES = "maturin"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/maturin-1.4.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maturin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/maturin-1.4.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_maturin}"
RDEPENDS:maturin = " \
 glibc \
 libgcc \
 python3 \
"
