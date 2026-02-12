
inherit dnf-bridge

PN = "kabi-dw"
PE = "0"
PV = "0"
PR = "0.30.20250206giteedfcbf.el10"
PACKAGES = "kabi-dw"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/kabi-dw-0-0.30.20250206giteedfcbf.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_kabi-dw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kabi-dw-0-0.30.20250206giteedfcbf.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_kabi-dw}"
RDEPENDS:kabi-dw = " \
 glibc \
 elfutils-libelf \
 elfutils-libs \
"
