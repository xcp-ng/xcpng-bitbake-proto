
PN = "tracer"
PE = "0"
PV = "1.1"
PR = "3.el10"
PACKAGES = "python3-tracer tracer-common"


URI_python3-tracer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-tracer-1.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-tracer = " \
 python3 \
 python3-psutil \
 python3-rpm \
 python3-dbus \
 python3-six \
 tracer-common \
 python3-distro \
"

URI_tracer-common = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tracer-common-1.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:tracer-common = ""
