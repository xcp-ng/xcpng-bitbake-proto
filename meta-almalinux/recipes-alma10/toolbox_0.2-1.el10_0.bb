
inherit dnf-bridge

PN = "toolbox"
PE = "0"
PV = "0.2"
PR = "1.el10_0"
PACKAGES = "toolbox toolbox-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/toolbox-0.2-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_toolbox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/toolbox-0.2-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_toolbox}"
RDEPENDS:toolbox = " \
 containers-common \
 flatpak-session-helper \
 shadow-utils-subid \
 glibc \
 podman \
"

URI_toolbox-tests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/toolbox-tests-0.2-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_toolbox-tests}"
RDEPENDS:toolbox-tests = " \
 python3 \
 openssl \
 diffutils \
 grep \
 httpd-tools \
 skopeo \
 glib2 \
 toolbox \
 coreutils \
"
