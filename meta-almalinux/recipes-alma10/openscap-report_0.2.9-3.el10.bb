
inherit dnf-bridge

PN = "openscap-report"
PE = "0"
PV = "0.2.9"
PR = "3.el10"
PACKAGES = "openscap-report"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/openscap-report-0.2.9-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_openscap-report = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openscap-report-0.2.9-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_openscap-report}"
RDEPENDS:openscap-report = " \
 python3 \
 python3-jinja2 \
 python3-lxml \
"
