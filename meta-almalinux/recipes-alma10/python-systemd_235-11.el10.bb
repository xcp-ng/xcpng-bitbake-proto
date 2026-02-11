
PN = "python-systemd"
PE = "0"
PV = "235"
PR = "11.el10"
PACKAGES = "python3-systemd python-systemd-doc"


URI_python3-systemd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-systemd-235-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-systemd = " \
 glibc \
 python3 \
 libgcc \
 systemd-libs \
"

URI_python-systemd-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-systemd-doc-235-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python-systemd-doc = " \
 js-jquery \
"
