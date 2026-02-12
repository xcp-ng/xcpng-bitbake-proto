
inherit dnf-bridge

PN = "python-dbus-signature-pyparsing"
PE = "0"
PV = "0.4.1"
PR = "9.el10"
PACKAGES = "python3-dbus-signature-pyparsing"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-dbus-signature-pyparsing-0.4.1-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-dbus-signature-pyparsing = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-dbus-signature-pyparsing-0.4.1-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-dbus-signature-pyparsing}"
RDEPENDS:python3-dbus-signature-pyparsing = " \
 python3 \
 python3-pyparsing \
"
