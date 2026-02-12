
inherit dnf-bridge

PN = "python-blivet"
PE = "1"
PV = "3.10.0"
PR = "16.el10_0"
PACKAGES = "blivet-data python3-blivet"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-blivet-3.10.0-16.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_blivet-data = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/blivet-data-3.10.0-16.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_blivet-data}"
RDEPENDS:blivet-data = " \
 python3 \
"

URI_python3-blivet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-blivet-3.10.0-16.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-blivet}"
RDEPENDS:python3-blivet = " \
 python3 \
 python3-pyudev \
 lsof \
 python3-blockdev \
 python3-libmount \
 util-linux \
 python3-bytesize \
 systemd-udev \
 python3-pyparted \
 python3-libselinux \
 blivet-data \
 parted \
 python3-gobject-base \
"
