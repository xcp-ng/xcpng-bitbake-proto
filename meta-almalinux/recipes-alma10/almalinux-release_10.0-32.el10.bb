
inherit dnf-bridge

PN = "almalinux-release"
PE = "0"
PV = "10.0"
PR = "32.el10"
PACKAGES = "almalinux-gpg-keys almalinux-release almalinux-repos almalinux-sb-certs"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/almalinux-release-10.0-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_almalinux-gpg-keys = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/almalinux-gpg-keys-10.0-32.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_almalinux-gpg-keys}"
RDEPENDS:almalinux-gpg-keys = ""

URI_almalinux-release = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/almalinux-release-10.0-32.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_almalinux-release}"
RDEPENDS:almalinux-release = " \
 almalinux-repos \
"

URI_almalinux-repos = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/almalinux-repos-10.0-32.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_almalinux-repos}"
RDEPENDS:almalinux-repos = " \
 almalinux-gpg-keys \
 almalinux-release \
"

URI_almalinux-sb-certs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/almalinux-sb-certs-10.0-32.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_almalinux-sb-certs}"
RDEPENDS:almalinux-sb-certs = ""
