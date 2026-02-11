
PN = "meson"
PE = "0"
PV = "1.4.1"
PR = "4.el10"
PACKAGES = "meson"


URI_meson = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/meson-1.4.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:meson = "/usr/bin/python3 ( ) python3.12dist(setuptools) ( ) ninja-build ( ) python(abi) ( =  3.12)"
RPROVIDES:meson = "rpm_macro(meson) ( ) rpm_macro(meson_build) ( ) rpm_macro(meson_install) ( ) rpm_macro(meson_test) ( ) meson ( =  1.4.1-4.el10) python3.12dist(meson) ( =  1.4.1) python3dist(meson) ( =  1.4.1)"
