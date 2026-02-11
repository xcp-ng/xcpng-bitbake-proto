
inherit dnf-bridge

PN = "sos"
PE = "0"
PV = "4.10.0"
PR = "4.el10_0"
PACKAGES = "sos sos-audit"


URI_sos = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sos-4.10.0-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:sos = " \
 python3 \
 python3-pyyaml \
 python3-requests \
 python3-setuptools \
 python3-packaging \
 python3-pexpect \
"

URI_sos-audit = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sos-audit-4.10.0-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:sos-audit = " \
 bash \
"
