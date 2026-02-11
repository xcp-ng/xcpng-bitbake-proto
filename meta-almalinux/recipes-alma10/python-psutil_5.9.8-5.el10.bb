
inherit dnf-bridge

PN = "python-psutil"
PE = "0"
PV = "5.9.8"
PR = "5.el10"
PACKAGES = "python3-psutil python3-psutil-tests"


URI_python3-psutil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-psutil-5.9.8-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-psutil = " \
 glibc \
 python3 \
"

URI_python3-psutil-tests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-psutil-tests-5.9.8-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-psutil-tests = " \
 python3 \
 python3-psutil \
"
