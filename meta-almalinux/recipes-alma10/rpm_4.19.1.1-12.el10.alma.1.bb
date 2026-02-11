
PN = "rpm"
PE = "0"
PV = "4.19.1.1"
PR = "12.el10.alma.1"
PACKAGES = "python3-rpm rpm rpm-build-libs rpm-libs rpm-plugin-audit rpm-plugin-selinux rpm-sign rpm-sign-libs rpm-apidocs rpm-build rpm-cron rpm-devel rpm-plugin-fapolicyd rpm-plugin-ima rpm-plugin-syslog rpm-plugin-systemd-inhibit rpm-plugin-dbus-announce rpm-plugin-prioreset"


URI_python3-rpm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-rpm-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-rpm = "
 python3
 rpm-sign-libs
 glibc
 rpm-build-libs
 rpm-libs
"

URI_rpm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm = "
 glibc
 libarchive
 curl
 rpm-libs
 bash
 popt
 sed
 coreutils
 findutils
"

URI_rpm-build-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-build-libs-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-build-libs = "
 lua-libs
 libgcc
 elfutils-libelf
 libcap
 elfutils-libs
 libgomp
 popt
 glibc
 file-libs
 rpm-libs
"

URI_rpm-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-libs-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-libs = "
 rpm-sequoia
 libacl
 zlib-ng-compat
 bzip2-libs
 lua-libs
 libcap
 libzstd
 sqlite-libs
 popt
 glibc
 rpm
 xz-libs
"

URI_rpm-plugin-audit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-plugin-audit-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-audit = "
 glibc
 audit-libs
 rpm-libs
"

URI_rpm-plugin-selinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-plugin-selinux-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-selinux = "
 glibc
 libselinux
 rpm-libs
 selinux-policy
"

URI_rpm-sign = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-sign-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-sign = "
 glibc
 rpm-libs
 rpm-sign-libs
 popt
"

URI_rpm-sign-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-sign-libs-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-sign-libs = "
 glibc
 rpm-libs
 ima-evm-utils
 popt
"

URI_rpm-apidocs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-apidocs-4.19.1.1-12.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rpm-apidocs = ""

URI_rpm-build = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-build-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-build = "
 tar
 patch
 unzip
 diffutils
 rpm-build-libs
 sed
 debugedit
 xz
 zstd
 redhat-rpm-config
 elfutils
 gdb-headless
 grep
 elfutils-libelf
 bash
 binutils
 file
 findutils
 bzip2
 gzip
 gawk
 readline
 pkgconf-pkg-config
 popt
 glibc
 rpm
 cpio
 rpm-libs
"

URI_rpm-cron = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-cron-4.19.1.1-12.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rpm-cron = "
 logrotate
 crontabs
 rpm
 bash
"

URI_rpm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-devel-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-devel = "
 rpm-sign-libs
 cmake-filesystem
 pkgconf-pkg-config
 popt-devel
 popt
 glibc
 rpm
 rpm-build-libs
 rpm-libs
"

URI_rpm-plugin-fapolicyd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-plugin-fapolicyd-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-fapolicyd = "
 glibc
 rpm-libs
"

URI_rpm-plugin-ima = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-plugin-ima-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-ima = "
 glibc
 rpm-libs
"

URI_rpm-plugin-syslog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-plugin-syslog-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-syslog = "
 glibc
 rpm-libs
"

URI_rpm-plugin-systemd-inhibit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-plugin-systemd-inhibit-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-systemd-inhibit = "
 glibc
 rpm-libs
 dbus-libs
"

URI_rpm-plugin-dbus-announce = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpm-plugin-dbus-announce-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-dbus-announce = "
 glibc
 rpm-libs
 dbus-libs
"

URI_rpm-plugin-prioreset = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpm-plugin-prioreset-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-prioreset = "
 glibc
 rpm-libs
"
