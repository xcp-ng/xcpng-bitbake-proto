
PN = "createrepo_c"
PE = "0"
PV = "1.1.2"
PR = "4.el10"
PACKAGES = "createrepo_c createrepo_c-libs python3-createrepo_c createrepo_c-devel"


URI_createrepo_c = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/createrepo_c-1.1.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:createrepo_c = "
 libgcc
 libmodulemd
 createrepo_c-libs
 glib2
 glibc
 rpm
"

URI_createrepo_c-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/createrepo_c-libs-1.1.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:createrepo_c-libs = "
 zlib-ng-compat
 bzip2-libs
 openssl-libs
 libgcc
 libxml2
 libmodulemd
 libzstd
 sqlite-libs
 glib2
 libcurl
 glibc
 rpm-libs
 xz-libs
"

URI_python3-createrepo_c = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-createrepo_c-1.1.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-createrepo_c = "
 python3
 createrepo_c-libs
 python3-libs
 glib2
 glibc
"

URI_createrepo_c-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/createrepo_c-devel-1.1.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:createrepo_c-devel = "
 libxml2-devel
 glib2-devel
 zlib-ng-compat-devel
 pkgconf-pkg-config
 createrepo_c-libs
 rpm-devel
 libcurl-devel
 sqlite-devel
"
