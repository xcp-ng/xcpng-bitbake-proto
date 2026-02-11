
PN = "toolbox"
PE = "0"
PV = "0.2"
PR = "1.el10_0"
PACKAGES = "toolbox toolbox-tests"


URI_toolbox = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/toolbox-0.2-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:toolbox = " \
 containers-common \
 flatpak-session-helper \
 shadow-utils-subid \
 glibc \
 podman \
"

URI_toolbox-tests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/toolbox-tests-0.2-1.el10_0.x86_64_v2.rpm;unpack=0"
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
