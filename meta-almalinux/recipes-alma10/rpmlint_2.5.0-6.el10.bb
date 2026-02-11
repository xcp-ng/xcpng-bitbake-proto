
PN = "rpmlint"
PE = "0"
PV = "2.5.0"
PR = "6.el10"
PACKAGES = "rpmlint"


URI_rpmlint = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpmlint-2.5.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:rpmlint = " \
 python3 \
 desktop-file-utils \
 python3-rpm \
 python3-file-magic \
 python3-tomli-w \
 python3-zstandard \
 rpm-build \
 python3-pyxdg \
 python3-packaging \
 python3-enchant \
 libappstream-glib \
"
