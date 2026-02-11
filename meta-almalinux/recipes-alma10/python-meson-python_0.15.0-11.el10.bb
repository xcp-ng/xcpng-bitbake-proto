
PN = "python-meson-python"
PE = "0"
PV = "0.15.0"
PR = "11.el10"
PACKAGES = "python3-meson-python"


URI_python3-meson-python = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-meson-python-0.15.0-11.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-meson-python = "python(abi) ( =  3.12) python3.12dist(meson) ( >=  1.2.3) python3.12dist(pyproject-metadata) ( >=  0.7.1)"
RPROVIDES:python3-meson-python = "python-meson-python ( =  0.15.0-11.el10) python-mesonpy ( =  0.15.0-11.el10) python3-meson-python ( =  0.15.0-11.el10) python3-mesonpy ( =  0.15.0-11.el10) python3.12-meson-python ( =  0.15.0-11.el10) python3.12-mesonpy ( =  0.15.0-11.el10) python3.12dist(meson-python) ( =  0.15) python3dist(meson-python) ( =  0.15)"
