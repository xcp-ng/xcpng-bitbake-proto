
inherit dnf-bridge

PN = "mod_wsgi"
PE = "0"
PV = "5.0.0"
PR = "4.el10"
PACKAGES = "python3-mod_wsgi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mod_wsgi-5.0.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-mod_wsgi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-mod_wsgi-5.0.0-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-mod_wsgi}"
RDEPENDS:python3-mod_wsgi = " \
 glibc \
 httpd-core \
 python3 \
 python3-libs \
"
