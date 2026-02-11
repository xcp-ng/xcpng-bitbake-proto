
PN = "gettext"
PE = "0"
PV = "0.22.5"
PR = "6.el10"
PACKAGES = "gettext gettext-envsubst gettext-libs gettext-runtime gettext-common-devel gettext-devel emacs-gettext msghack"


URI_gettext = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gettext-0.22.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gettext = "
 libgcc
 libxml2
 libgomp
 gettext-libs
 gettext-runtime
 bash
 glibc
 libunistring
"

URI_gettext-envsubst = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gettext-envsubst-0.22.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gettext-envsubst = "
 glibc
"

URI_gettext-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gettext-libs-0.22.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gettext-libs = "
 libacl
 libattr
 libxml2
 libstdc++
 glibc
 libunistring
"

URI_gettext-runtime = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gettext-runtime-0.22.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gettext-runtime = "
 glibc
 gettext-libs
 bash
 gettext-envsubst
"

URI_gettext-common-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gettext-common-devel-0.22.5-6.el10.noarch.rpm;unpack=0"
RDEPENDS:gettext-common-devel = ""

URI_gettext-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gettext-devel-0.22.5-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gettext-devel = "
 diffutils
 gettext
 gettext-libs
 bash
 glibc
 gettext-common-devel
 xz
"

URI_emacs-gettext = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/emacs-gettext-0.22.5-6.el10.noarch.rpm;unpack=0"
RDEPENDS:emacs-gettext = "
 emacs
"

URI_msghack = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/msghack-0.22.5-6.el10.noarch.rpm;unpack=0"
RDEPENDS:msghack = "
 python3
"
