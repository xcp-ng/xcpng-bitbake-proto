
inherit dnf-bridge

PN = "python-meson-python"
PE = "0"
PV = "0.15.0"
PR = "11.el10"
PACKAGES = "python3-meson-python"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-meson-python-0.15.0-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-meson-python = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-meson-python-0.15.0-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-meson-python}"
RDEPENDS:python3-meson-python = " \
 python3 \
 python3-pyproject-metadata \
 meson \
"
