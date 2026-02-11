
PN = "rpm"
PE = "0"
PV = "4.19.1.1"
PR = "12.el10.alma.1"
PACKAGES = "python3-rpm rpm rpm-build-libs rpm-libs rpm-plugin-audit rpm-plugin-selinux rpm-sign rpm-sign-libs rpm-apidocs rpm-build rpm-cron rpm-devel rpm-plugin-fapolicyd rpm-plugin-ima rpm-plugin-syslog rpm-plugin-systemd-inhibit rpm-plugin-dbus-announce rpm-plugin-prioreset"


URI_python3-rpm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-rpm-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-rpm = "rtld(GNU_HASH) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) libc.so.6(GLIBC_2.28)(64bit) ( ) librpmsign.so.10()(64bit) ( ) librpmbuild.so.10()(64bit) ( ) python(abi) ( =  3.12) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:python3-rpm = "python-rpm ( =  4.19.1.1-12.el10.alma.1) python3-rpm ( =  4.19.1.1-12.el10.alma.1) python3-rpm(x86-64) ( =  4.19.1.1-12.el10.alma.1) python3.12-rpm ( =  4.19.1.1-12.el10.alma.1) python3.12dist(rpm) ( =  4.19.1.1) python3dist(rpm) ( =  4.19.1.1) rpm-python3 ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm = "/bin/sh ( ) coreutils ( ) sed ( ) findutils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpopt.so.0()(64bit) ( ) /usr/bin/bash ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) curl ( ) libarchive.so.13()(64bit) ( ) popt(x86-64) ( >=  1.10.2.1)"
RPROVIDES:rpm = "rpm ( =  4.19.1.1-12.el10.alma.1) config(rpm) ( =  4.19.1.1-12.el10.alma.1) rpm(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-build-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-build-libs-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-build-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libcap.so.2()(64bit) ( ) libelf.so.1()(64bit) ( ) librpmio.so.10()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) libdw.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.5)(64bit) ( ) librpm.so.10()(64bit) ( ) libdw.so.1(ELFUTILS_0.159)(64bit) ( ) libdw.so.1(ELFUTILS_0.177)(64bit) ( ) libmagic.so.1()(64bit) ( ) libgomp.so.1()(64bit) ( ) libgomp.so.1(GOMP_1.0)(64bit) ( ) libgomp.so.1(GOMP_4.0)(64bit) ( ) liblua-5.4.so()(64bit) ( ) libgomp.so.1(GOMP_2.0)(64bit) ( ) libgomp.so.1(OMP_1.0)(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-build-libs = "librpmbuild.so.10()(64bit) ( ) rpm-build-libs ( =  4.19.1.1-12.el10.alma.1) rpm-build-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-libs-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpopt.so.0()(64bit) ( ) libz.so.1()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libcap.so.2()(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libacl.so.1()(64bit) ( ) libzstd.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( ) libbz2.so.1()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libz.so.1(ZLIB_1.2.3.3)(64bit) ( ) liblzma.so.5(XZ_5.2)(64bit) ( ) liblua-5.4.so()(64bit) ( ) librpm_sequoia.so.1()(64bit) ( ) rpm ( =  4.19.1.1-12.el10.alma.1) rpm-sequoia(x86-64) ( >=  1.4.0)"
RPROVIDES:rpm-libs = "librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1) rpm-libs ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-plugin-audit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-plugin-audit-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-audit = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libaudit.so.1()(64bit) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-plugin-audit = "rpm-plugin-audit ( =  4.19.1.1-12.el10.alma.1) rpm-plugin-audit(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-plugin-selinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-plugin-selinux-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-selinux = "rtld(GNU_HASH) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) selinux-policy-base ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-plugin-selinux = "rpm-plugin-selinux ( =  4.19.1.1-12.el10.alma.1) rpm-plugin-selinux(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-sign = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-sign-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-sign = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) librpmsign.so.10()(64bit) ( ) rpm-sign-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-sign = "rpm-sign ( =  4.19.1.1-12.el10.alma.1) rpm-sign(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-sign-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpm-sign-libs-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-sign-libs = "rtld(GNU_HASH) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) libimaevm.so.5()(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-sign-libs = "librpmsign.so.10()(64bit) ( ) rpm-sign-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1) rpm-sign-libs ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-apidocs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-apidocs-4.19.1.1-12.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rpm-apidocs = ""
RPROVIDES:rpm-apidocs = "rpm-apidocs ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-build = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-build-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-build = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) /usr/bin/bash ( ) libelf.so.1()(64bit) ( ) libelf.so.1(ELFUTILS_1.0)(64bit) ( ) findutils ( ) grep ( ) libreadline.so.8()(64bit) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) bzip2 ( ) gawk ( ) sed ( ) librpm.so.10()(64bit) ( ) librpmio.so.10()(64bit) ( ) tar ( ) xz ( ) gzip ( ) binutils ( ) diffutils ( ) /usr/bin/gdb-add-index ( ) file ( ) cpio ( ) unzip ( ) zstd ( ) system-rpm-config ( ) librpmbuild.so.10()(64bit) ( ) rpm ( =  4.19.1.1-12.el10.alma.1) debugedit ( >=  0.3) elfutils ( >=  0.128) patch ( >=  2.5) pkgconfig ( >=  1:0.24)"
RPROVIDES:rpm-build = "rpm-build ( =  4.19.1.1-12.el10.alma.1) rpm-build(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-cron = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-cron-4.19.1.1-12.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rpm-cron = "/usr/bin/sh ( ) logrotate ( ) crontabs ( ) rpm ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-cron = "config(rpm-cron) ( =  4.19.1.1-12.el10.alma.1) rpm-cron ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-devel-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libpopt.so.0()(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) librpm.so.10()(64bit) ( ) librpmio.so.10()(64bit) ( ) librpmbuild.so.10()(64bit) ( ) pkgconfig(popt) ( ) popt-devel(x86-64) ( ) librpmsign.so.10()(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1) rpm ( =  4.19.1.1-12.el10.alma.1) rpm-build-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1) rpm-sign-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-devel = "cmake(rpm) ( =  4.19.1.1) pkgconfig(rpm) ( =  4.19.1.1) rpm-devel ( =  4.19.1.1-12.el10.alma.1) rpm-devel(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-plugin-fapolicyd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-plugin-fapolicyd-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-fapolicyd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) librpm.so.10()(64bit) ( ) librpmio.so.10()(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-plugin-fapolicyd = "fapolicyd-plugin ( =  4.19.1.1-12.el10.alma.1) rpm-plugin-fapolicyd ( =  4.19.1.1-12.el10.alma.1) rpm-plugin-fapolicyd(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-plugin-ima = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-plugin-ima-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-ima = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) librpm.so.10()(64bit) ( ) librpmio.so.10()(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-plugin-ima = "rpm-plugin-ima ( =  4.19.1.1-12.el10.alma.1) rpm-plugin-ima(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-plugin-syslog = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-plugin-syslog-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-syslog = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) librpm.so.10()(64bit) ( ) librpmio.so.10()(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-plugin-syslog = "rpm-plugin-syslog ( =  4.19.1.1-12.el10.alma.1) rpm-plugin-syslog(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-plugin-systemd-inhibit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rpm-plugin-systemd-inhibit-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-systemd-inhibit = "rtld(GNU_HASH) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) librpm.so.10()(64bit) ( ) librpmio.so.10()(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-plugin-systemd-inhibit = "rpm-plugin-systemd-inhibit ( =  4.19.1.1-12.el10.alma.1) rpm-plugin-systemd-inhibit(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-plugin-dbus-announce = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpm-plugin-dbus-announce-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-dbus-announce = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-plugin-dbus-announce = "rpm-plugin-dbus-announce ( =  4.19.1.1-12.el10.alma.1) rpm-plugin-dbus-announce(x86-64) ( =  4.19.1.1-12.el10.alma.1)"

URI_rpm-plugin-prioreset = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpm-plugin-prioreset-4.19.1.1-12.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpm-plugin-prioreset = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) librpmio.so.10()(64bit) ( ) rpm-libs(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
RPROVIDES:rpm-plugin-prioreset = "rpm-plugin-prioreset ( =  4.19.1.1-12.el10.alma.1) rpm-plugin-prioreset(x86-64) ( =  4.19.1.1-12.el10.alma.1)"
