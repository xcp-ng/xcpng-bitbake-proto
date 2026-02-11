
PN = "stratis-cli"
PE = "0"
PV = "3.7.0"
PR = "2.el10"
PACKAGES = "stratis-cli"


URI_stratis-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/stratis-cli-3.7.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:stratis-cli = " \
 python3 \
 python3-wcwidth \
 python3-psutil \
 python3-dateutil \
 stratisd \
 python3-dbus-client-gen \
 python3-dbus-python-client-gen \
 python3-justbytes \
 python3-packaging \
"
