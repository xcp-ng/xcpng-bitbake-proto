
inherit dnf-bridge

PN = "ddiskit"
PE = "0"
PV = "3.6"
PR = "28.20250206gitd857c77.el10"
PACKAGES = "ddiskit"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ddiskit-3.6-28.20250206gitd857c77.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ddiskit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ddiskit-3.6-28.20250206gitd857c77.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ddiskit}"
RDEPENDS:ddiskit = " \
 python3 \
 rpm \
 createrepo_c \
 xorriso \
"
