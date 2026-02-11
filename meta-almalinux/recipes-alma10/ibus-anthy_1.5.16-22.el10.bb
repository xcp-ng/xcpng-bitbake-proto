
inherit dnf-bridge

PN = "ibus-anthy"
PE = "0"
PV = "1.5.16"
PR = "22.el10"
PACKAGES = "ibus-anthy ibus-anthy-python ibus-anthy-devel ibus-anthy-tests"


URI_ibus-anthy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-anthy-1.5.16-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-anthy = " \
 kasumi-unicode \
 ibus \
 ibus-anthy-python \
 glib2 \
 glibc \
 anthy-unicode \
"

URI_ibus-anthy-python = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-anthy-python-1.5.16-22.el10.noarch.rpm;unpack=0"
RDEPENDS:ibus-anthy-python = " \
 python3-gobject \
 python3-cairo \
 ibus-anthy \
 bash \
 gtk3 \
"

URI_ibus-anthy-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-anthy-devel-1.5.16-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-anthy-devel = " \
 ibus-anthy \
 glib2-devel \
 anthy-unicode-devel \
"

URI_ibus-anthy-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-anthy-tests-1.5.16-22.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-anthy-tests = " \
 python3 \
 ibus-anthy \
 python3-pycotap \
"
