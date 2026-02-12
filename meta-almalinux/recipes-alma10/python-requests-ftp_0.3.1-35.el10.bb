
inherit dnf-bridge

PN = "python-requests-ftp"
PE = "0"
PV = "0.3.1"
PR = "35.el10"
PACKAGES = "python3-requests-ftp"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-requests-ftp-0.3.1-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-requests-ftp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-requests-ftp-0.3.1-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-requests-ftp}"
RDEPENDS:python3-requests-ftp = " \
 python3 \
 python3-requests \
"
