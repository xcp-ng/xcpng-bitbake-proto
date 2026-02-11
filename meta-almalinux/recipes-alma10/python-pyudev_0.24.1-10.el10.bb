
inherit dnf-bridge

PN = "python-pyudev"
PE = "0"
PV = "0.24.1"
PR = "10.el10"
PACKAGES = "python3-pyudev"


URI_python3-pyudev = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-pyudev-0.24.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pyudev = " \
 python3 \
 systemd-libs \
"
