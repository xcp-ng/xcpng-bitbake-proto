
PN = "ibus-hangul"
PE = "0"
PV = "1.5.5"
PR = "9.el10"
PACKAGES = "ibus-hangul ibus-hangul-tests"


URI_ibus-hangul = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-hangul-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-hangul = " \
 python3 \
 python3-gobject \
 libhangul \
 ibus \
 bash \
 glib2 \
 ibus-libs \
 glibc \
"

URI_ibus-hangul-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ibus-hangul-tests-1.5.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ibus-hangul-tests = " \
 libhangul \
 glib2 \
 gtk3 \
 ibus-libs \
 glibc \
 ibus-hangul \
"
