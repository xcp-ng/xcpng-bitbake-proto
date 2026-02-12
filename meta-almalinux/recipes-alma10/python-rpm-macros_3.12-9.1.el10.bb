
inherit dnf-bridge

PN = "python-rpm-macros"
PE = "0"
PV = "3.12"
PR = "9.1.el10"
PACKAGES = "python-rpm-macros python-srpm-macros python3-rpm-macros"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-rpm-macros-3.12-9.1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python-rpm-macros-3.12-9.1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python-rpm-macros}"
RDEPENDS:python-rpm-macros = " \
 python-srpm-macros \
"

URI_python-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python-srpm-macros-3.12-9.1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python-srpm-macros}"
RDEPENDS:python-srpm-macros = " \
 redhat-rpm-config \
 bash \
"

URI_python3-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-rpm-macros-3.12-9.1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-rpm-macros}"
RDEPENDS:python3-rpm-macros = " \
 python-rpm-macros \
 python-srpm-macros \
"
