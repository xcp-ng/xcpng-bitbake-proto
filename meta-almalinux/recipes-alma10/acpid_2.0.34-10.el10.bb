
inherit dnf-bridge

PN = "acpid"
PE = "0"
PV = "2.0.34"
PR = "10.el10"
PACKAGES = "acpid"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/acpid-2.0.34-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_acpid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/acpid-2.0.34-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_acpid}"
RDEPENDS:acpid = " \
 glibc \
 systemd \
 bash \
"
