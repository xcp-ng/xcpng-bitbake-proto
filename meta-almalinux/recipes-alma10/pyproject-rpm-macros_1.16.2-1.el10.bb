
inherit dnf-bridge

PN = "pyproject-rpm-macros"
PE = "0"
PV = "1.16.2"
PR = "1.el10"
PACKAGES = "pyproject-srpm-macros pyproject-rpm-macros"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pyproject-rpm-macros-1.16.2-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pyproject-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pyproject-srpm-macros-1.16.2-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_pyproject-srpm-macros}"
RDEPENDS:pyproject-srpm-macros = " \
 rpm-build \
 pyproject-rpm-macros \
"

URI_pyproject-rpm-macros = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pyproject-rpm-macros-1.16.2-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_pyproject-rpm-macros}"
RDEPENDS:pyproject-rpm-macros = " \
 pyproject-srpm-macros \
 python-rpm-macros \
 python-srpm-macros \
 rpm-build \
 sed \
 findutils \
 python3-rpm-macros \
"
