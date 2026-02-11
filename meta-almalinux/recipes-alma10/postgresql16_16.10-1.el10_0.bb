
PN = "postgresql16"
PE = "0"
PV = "16.10"
PR = "1.el10_0"
PACKAGES = "postgresql postgresql-contrib postgresql-docs postgresql-plperl postgresql-plpython3 postgresql-pltcl postgresql-private-devel postgresql-private-libs postgresql-server postgresql-server-devel postgresql-static postgresql-test postgresql-upgrade postgresql-upgrade-devel postgresql-test-rpm-macros"


URI_postgresql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libzstd.so.1()(64bit) ( ) libreadline.so.8()(64bit) ( ) liblz4.so.1()(64bit) ( ) libpq.so.private16-5()(64bit) ( )"
RPROVIDES:postgresql = "postgresql-any ( ) postgresql(x86-64) ( =  16.10-1.el10_0) postgresql ( =  16.10-1.el10_0) postgresql16 ( =  16.10-1.el10_0) postgresql16(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-contrib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-contrib-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-contrib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libperl.so.5.40()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libzstd.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) liblz4.so.1()(64bit) ( ) libxslt.so.1()(64bit) ( ) libpq.so.private16-5()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.5)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.11)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.18)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.22)(64bit) ( ) libossp-uuid.so.16()(64bit) ( ) postgresql(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-contrib = "postgresql-contrib-any ( ) postgresql-contrib(x86-64) ( =  16.10-1.el10_0) postgresql-contrib ( =  16.10-1.el10_0) postgresql16-contrib ( =  16.10-1.el10_0) postgresql16-contrib(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-docs-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-docs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) postgresql(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-docs = "postgresql-docs-any ( ) postgresql-doc ( =  16.10-1.el10_0) postgresql-docs ( =  16.10-1.el10_0) postgresql-docs(x86-64) ( =  16.10-1.el10_0) postgresql16-docs ( =  16.10-1.el10_0) postgresql16-docs(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-plperl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-plperl-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-plperl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.2) ( ) postgresql-server(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-plperl = "postgresql-plperl-any ( ) postgresql-plperl ( =  16.10-1.el10_0) postgresql-plperl(x86-64) ( =  16.10-1.el10_0) postgresql16-plperl ( =  16.10-1.el10_0) postgresql16-plperl(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-plpython3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-plpython3-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-plpython3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) postgresql-server(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-plpython3 = "postgresql-plpython3-any ( ) postgresql-plpython3 ( =  16.10-1.el10_0) postgresql-plpython3(x86-64) ( =  16.10-1.el10_0) postgresql16-plpython3 ( =  16.10-1.el10_0) postgresql16-plpython3(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-pltcl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-pltcl-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-pltcl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libtcl8.6.so()(64bit) ( ) postgresql-server(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-pltcl = "postgresql-pltcl-any ( ) postgresql-pltcl ( =  16.10-1.el10_0) postgresql-pltcl(x86-64) ( =  16.10-1.el10_0) postgresql16-pltcl ( =  16.10-1.el10_0) postgresql16-pltcl(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-private-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-private-devel-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-private-devel = "/usr/bin/pkg-config ( ) libpq.so.private16-5()(64bit) ( ) pkgconfig(libcrypto) ( ) pkgconfig(libssl) ( ) postgresql-private-libs(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-private-devel = "postgresql-private-devel-any ( ) postgresql-devel ( =  16.10-1.el10_0) postgresql-devel(x86-64) ( =  16.10-1.el10_0) postgresql-private-devel ( =  16.10-1.el10_0) postgresql-private-devel(x86-64) ( =  16.10-1.el10_0) postgresql16-private-devel ( =  16.10-1.el10_0) postgresql16-private-devel(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-private-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-private-libs-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-private-libs = "glibc ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libldap.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( )"
RPROVIDES:postgresql-private-libs = "libpq.so.private16-5()(64bit) ( ) postgresql-private-libs-any ( ) postgresql-private-libs(x86-64) ( =  16.10-1.el10_0) postgresql-private-libs ( =  16.10-1.el10_0) postgresql16-private-libs ( =  16.10-1.el10_0) postgresql16-private-libs(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-server-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-server = "/bin/sh ( ) systemd ( ) /usr/sbin/useradd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) libssl.so.3()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libxml2.so.2()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libzstd.so.1()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) util-linux ( ) libldap.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libicuuc.so.74()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libicui18n.so.74()(64bit) ( ) liblz4.so.1()(64bit) ( ) libpq.so.private16-5()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.5)(64bit) ( ) libicudata.so.74()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.23)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.8)(64bit) ( ) postgresql(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-server = "postgresql-server-any ( ) postgresql-server(:MODULE_COMPAT_16) ( ) postgresql-server(x86-64) ( =  16.10-1.el10_0) bundled(postgresql-setup) ( =  8.9) config(postgresql-server) ( =  16.10-1.el10_0) postgresql-server ( =  16.10-1.el10_0) postgresql16-server ( =  16.10-1.el10_0) postgresql16-server(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-server-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-server-devel-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-server-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libpq.so.private16-5()(64bit) ( ) krb5-devel ( ) libicu-devel ( ) postgresql-private-devel ( )"
RPROVIDES:postgresql-server-devel = "postgresql-server-devel-any ( ) rpm_macro(postgresql_major) ( ) rpm_macro(postgresql_module_requires) ( ) rpm_macro(postgresql_server_llvmjit) ( ) postgresql-server-devel(x86-64) ( =  16.10-1.el10_0) postgresql-server-devel ( =  16.10-1.el10_0) postgresql16-server-devel ( =  16.10-1.el10_0) postgresql16-server-devel(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-static = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-static-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-static = "postgresql-server-devel(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-static = "postgresql-static-any ( ) postgresql-static ( =  16.10-1.el10_0) postgresql-static(x86-64) ( =  16.10-1.el10_0) postgresql16-static ( =  16.10-1.el10_0) postgresql16-static(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-test = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-test-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-test = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) postgresql-server(x86-64) ( =  16.10-1.el10_0) postgresql-server-devel(x86-64) ( =  16.10-1.el10_0) postgresql-contrib(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-test = "postgresql-test-any ( ) postgresql-test ( =  16.10-1.el10_0) postgresql-test(x86-64) ( =  16.10-1.el10_0) postgresql16-test ( =  16.10-1.el10_0) postgresql16-test(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-upgrade = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-upgrade-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-upgrade = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libperl.so.5.40()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libldap.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libicuuc.so.74()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libicui18n.so.74()(64bit) ( ) libxslt.so.1()(64bit) ( ) libpq.so.private16-5()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.5)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.11)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.18)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.22)(64bit) ( ) libtcl8.6.so()(64bit) ( ) libossp-uuid.so.16()(64bit) ( ) postgresql-server(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-upgrade = "postgresql-upgrade-any ( ) postgresql-upgrade(x86-64) ( =  16.10-1.el10_0) bundled(postgresql-server) ( =  13.22) postgresql-upgrade ( =  16.10-1.el10_0) postgresql16-upgrade ( =  16.10-1.el10_0) postgresql16-upgrade(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-upgrade-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postgresql-upgrade-devel-16.10-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:postgresql-upgrade-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) postgresql-upgrade(x86-64) ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-upgrade-devel = "postgresql-upgrade-devel-any ( ) rpm_macro(postgresql_upgrade_prefix) ( ) postgresql-upgrade-devel ( =  16.10-1.el10_0) postgresql-upgrade-devel(x86-64) ( =  16.10-1.el10_0) postgresql16-upgrade-devel ( =  16.10-1.el10_0) postgresql16-upgrade-devel(x86-64) ( =  16.10-1.el10_0)"

URI_postgresql-test-rpm-macros = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/postgresql-test-rpm-macros-16.10-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:postgresql-test-rpm-macros = "postgresql-server ( =  16.10-1.el10_0)"
RPROVIDES:postgresql-test-rpm-macros = "postgresql-test-rpm-macros-any ( ) rpm_macro(pgtests_init) ( ) rpm_macro(pgtests_start) ( ) rpm_macro(postgresql_tests_init) ( ) rpm_macro(postgresql_tests_run) ( ) rpm_macro(postgresql_tests_start) ( ) postgresql-test-rpm-macros ( =  16.10-1.el10_0)"
