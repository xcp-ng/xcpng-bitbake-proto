
inherit dnf-bridge

PN = "stalld"
PE = "0"
PV = "1.19.8"
PR = "2.el10_0"
PACKAGES = "stalld"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/stalld-1.19.8-2.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_stalld = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/stalld-1.19.8-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_stalld}"
RDEPENDS:stalld = " \
 glibc \
 systemd \
 bash \
 libbpf \
"
