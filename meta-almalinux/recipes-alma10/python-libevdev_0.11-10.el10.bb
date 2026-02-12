
inherit dnf-bridge

PN = "python-libevdev"
PE = "0"
PV = "0.11"
PR = "10.el10"
PACKAGES = "python3-libevdev"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-libevdev-0.11-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-libevdev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libevdev-0.11-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-libevdev}"
RDEPENDS:python3-libevdev = " \
 python3 \
 libevdev \
"
