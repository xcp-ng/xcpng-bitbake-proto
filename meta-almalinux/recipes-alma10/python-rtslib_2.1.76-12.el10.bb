
PN = "python-rtslib"
PE = "0"
PV = "2.1.76"
PR = "12.el10"
PACKAGES = "python3-rtslib target-restore"


URI_python3-rtslib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-rtslib-2.1.76-12.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-rtslib = " \
 python3-pyudev \
 python3-six \
 python3 \
 python3-kmod \
"

URI_target-restore = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/target-restore-2.1.76-12.el10.noarch.rpm;unpack=0"
RDEPENDS:target-restore = " \
 python3 \
 systemd \
 bash \
 python3-rtslib \
"
