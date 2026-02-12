
inherit dnf-bridge

PN = "nasm"
PE = "0"
PV = "2.16.01"
PR = "9.el10"
PACKAGES = "nasm"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/nasm-2.16.01-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nasm = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nasm-2.16.01-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nasm}"
RDEPENDS:nasm = " \
 glibc \
"
