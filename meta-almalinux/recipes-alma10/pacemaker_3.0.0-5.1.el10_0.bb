
PN = "pacemaker"
PE = "0"
PV = "3.0.0"
PR = "5.1.el10_0"
PACKAGES = "pacemaker-cluster-libs pacemaker-libs pacemaker-schemas"


URI_pacemaker-cluster-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pacemaker-cluster-libs-3.0.0-5.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pacemaker-cluster-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libuuid.so.1()(64bit) ( ) libbz2.so.1()(64bit) ( ) libxslt.so.1()(64bit) ( ) libqb.so.100()(64bit) ( ) libcpg.so.4()(64bit) ( ) libcpg.so.4(COROSYNC_CPG_1.0)(64bit) ( ) libcrmcommon.so.68()(64bit) ( ) libcmap.so.4()(64bit) ( ) libcmap.so.4(COROSYNC_CMAP_1.0)(64bit) ( ) libcrmservice.so.53()(64bit) ( ) libstonithd.so.56()(64bit) ( ) libcfg.so.7()(64bit) ( ) libcorosync_common.so.4()(64bit) ( ) libquorum.so.5()(64bit) ( ) libquorum.so.5(COROSYNC_QUORUM_1.0)(64bit) ( ) pacemaker-libs(x86-64) ( =  3.0.0-5.1.el10_0)"
RPROVIDES:pacemaker-cluster-libs = "libcrmcluster.so.53()(64bit) ( ) pacemaker-cluster-libs ( =  3.0.0-5.1.el10_0) pacemaker-cluster-libs(x86-64) ( =  3.0.0-5.1.el10_0)"

URI_pacemaker-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pacemaker-libs-3.0.0-5.1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pacemaker-libs = "/bin/sh ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libbz2.so.1()(64bit) ( ) libxslt.so.1()(64bit) ( ) libxslt.so.1(LIBXML2_1.0.11)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.2)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.18)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.22)(64bit) ( ) libqb.so.100()(64bit) ( ) libxml2.so.2(LIBXML2_2.7.3)(64bit) ( ) pacemaker-schemas ( =  3.0.0-5.1.el10_0)"
RPROVIDES:pacemaker-libs = "libcrmcommon.so.68()(64bit) ( ) libcrmservice.so.53()(64bit) ( ) libstonithd.so.56()(64bit) ( ) libcib.so.54()(64bit) ( ) libpe_status.so.56()(64bit) ( ) group(hacluster) ( ) liblrmd.so.52()(64bit) ( ) libpacemaker.so.30()(64bit) ( ) libpe_rules.so.51()(64bit) ( ) pacemaker-libs(x86-64) ( =  3.0.0-5.1.el10_0) group(haclient) ( =  ZyBoYWNsaWVudCAxODkA) user(hacluster) ( =  dSBoYWNsdXN0ZXIgMTg5OmhhY2xpZW50ICJjbHVzdGVyIHVzZXIiIC92YXIvbGliL3BhY2VtYWtlciAvc2Jpbi9ub2xvZ2lu) pacemaker-libs ( =  3.0.0-5.1.el10_0)"

URI_pacemaker-schemas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pacemaker-schemas-3.0.0-5.1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:pacemaker-schemas = "/usr/bin/pkg-config ( )"
RPROVIDES:pacemaker-schemas = "pacemaker-schemas ( =  3.0.0-5.1.el10_0) pkgconfig(pacemaker-schemas) ( =  3.0.0-5.1.el10_0)"
