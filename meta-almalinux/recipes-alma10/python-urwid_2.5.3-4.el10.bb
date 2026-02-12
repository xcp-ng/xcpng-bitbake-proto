
inherit dnf-bridge

PN = "python-urwid"
PE = "0"
PV = "2.5.3"
PR = "4.el10"
PACKAGES = "python3-urwid"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-urwid-2.5.3-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-urwid = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-urwid-2.5.3-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-urwid}"
RDEPENDS:python3-urwid = " \
 glibc \
 python3-wcwidth \
 python3 \
 python3-typing-extensions \
"
