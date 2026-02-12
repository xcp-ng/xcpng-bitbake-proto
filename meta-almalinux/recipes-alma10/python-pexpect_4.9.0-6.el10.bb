
inherit dnf-bridge

PN = "python-pexpect"
PE = "0"
PV = "4.9.0"
PR = "6.el10"
PACKAGES = "python3-pexpect"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-pexpect-4.9.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pexpect = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-pexpect-4.9.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pexpect}"
RDEPENDS:python3-pexpect = " \
 python3 \
 python3-ptyprocess \
"
