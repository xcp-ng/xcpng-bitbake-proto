
PN = "subversion"
PE = "0"
PV = "1.14.3"
PR = "8.el10"
PACKAGES = "mod_dav_svn python3-subversion subversion subversion-devel subversion-gnome subversion-libs subversion-perl subversion-tools"


URI_mod_dav_svn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_dav_svn-1.14.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_dav_svn = " \
 zlib-ng-compat \
 httpd-core \
 libxcrypt \
 lz4-libs \
 apr \
 utf8proc \
 apr-util \
 sqlite-libs \
 subversion-libs \
 expat \
 glibc \
 file-libs \
"

URI_python3-subversion = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-subversion-1.14.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-subversion = " \
 python3 \
 zlib-ng-compat \
 libxcrypt \
 lz4-libs \
 apr \
 utf8proc \
 apr-util \
 sqlite-libs \
 cyrus-sasl-lib \
 subversion-libs \
 expat \
 glibc \
 libserf \
 file-libs \
"

URI_subversion = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/subversion-1.14.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:subversion = " \
 systemd \
 apr \
 apr-util \
 subversion-libs \
 bash \
 glibc \
"

URI_subversion-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/subversion-devel-1.14.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:subversion-devel = " \
 apr-devel \
 pkgconf-pkg-config \
 apr-util-devel \
 subversion-devel \
 subversion-libs \
 libsecret-devel \
 sqlite-devel \
"

URI_subversion-gnome = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/subversion-gnome-1.14.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:subversion-gnome = " \
 zlib-ng-compat \
 libxcrypt \
 lz4-libs \
 apr \
 utf8proc \
 apr-util \
 sqlite-libs \
 libsecret \
 subversion-libs \
 glib2 \
 expat \
 glibc \
 file-libs \
"

URI_subversion-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/subversion-libs-1.14.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:subversion-libs = " \
 zlib-ng-compat \
 libxcrypt \
 lz4-libs \
 apr \
 utf8proc \
 apr-util \
 sqlite-libs \
 cyrus-sasl-lib \
 expat \
 glibc \
 libserf \
 file-libs \
"

URI_subversion-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/subversion-perl-1.14.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:subversion-perl = " \
 perl-Scalar-List-Utils \
 perl-libs \
 apr \
 apr-util \
 perl-overload \
 perl-Symbol \
 perl-Carp \
 perl-IO \
 utf8proc \
 zlib-ng-compat \
 libxcrypt \
 perl-DynaLoader \
 sqlite-libs \
 expat \
 file-libs \
 lz4-libs \
 subversion-libs \
 glibc \
 perl-File-Temp \
"

URI_subversion-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/subversion-tools-1.14.3-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:subversion-tools = " \
 glibc \
 apr \
 subversion-libs \
 bash \
"
