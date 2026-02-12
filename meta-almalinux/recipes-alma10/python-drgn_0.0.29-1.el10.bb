
inherit dnf-bridge

PN = "python-drgn"
PE = "0"
PV = "0.0.29"
PR = "1.el10"
PACKAGES = "drgn"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-drgn-0.0.29-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_drgn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/drgn-0.0.29-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_drgn}"
RDEPENDS:drgn = " \
 python3 \
 libgcc \
 elfutils-libelf \
 libgomp \
 elfutils-libs \
 glibc \
 libkdumpfile \
"
