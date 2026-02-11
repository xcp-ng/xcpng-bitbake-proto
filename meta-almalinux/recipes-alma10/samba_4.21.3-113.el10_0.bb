
PN = "samba"
PE = "0"
PV = "4.21.3"
PR = "113.el10_0"
PACKAGES = "ldb-tools libldb libnetapi libsmbclient libwbclient python3-ldb python3-samba python3-samba-dc samba samba-client-libs samba-common samba-common-libs samba-common-tools samba-dc-libs samba-dcerpc samba-ldb-ldap-modules samba-libs samba-tools samba-usershares samba-winbind samba-winbind-modules samba-client samba-gpupdate samba-krb5-printing samba-vfs-iouring samba-winbind-clients samba-winbind-krb5-locator samba-winexe libldb-devel libnetapi-devel libsmbclient-devel libwbclient-devel python3-samba-test samba-devel samba-pidl samba-test samba-test-libs ctdb"


URI_ldb-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ldb-tools-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ldb-tools = "
 glibc
 popt
 libldb
 libtalloc
"

URI_libldb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libldb-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libldb = "
 libtevent
 libtalloc
 libtdb
 glibc
 lmdb-libs
"

URI_libnetapi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnetapi-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetapi = "
 gnutls
 libwbclient
 libldb
 libgcc
 samba-client-libs
 samba-common
 samba-common-libs
 libtalloc
 glibc
"

URI_libsmbclient = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsmbclient-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsmbclient = "
 libwbclient
 libldb
 samba-client-libs
 libtevent
 samba-common
 samba-common-libs
 libtalloc
 glibc
"

URI_libwbclient = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libwbclient-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwbclient = "
 glibc
 samba-client-libs
 bash
"

URI_python3-ldb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-ldb-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-ldb = "
 python3
 libldb
 samba-client-libs
 python3-libs
 libtalloc
 glibc
 python3-tdb
"

URI_python3-samba = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-samba-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-samba = "
 python3
 python3-cryptography
 samba-client-libs
 krb5-libs
 samba-common-libs
 python3-dns
 samba-dc-libs
 libsmbclient
 python3-ldb
 samba-libs
 python3-libs
 libtalloc
 libtevent
 python3-requests
 gnutls
 libwbclient
 libgcc
 python3-talloc
 python3-tdb
 python3-tevent
 libldb
 glibc
"

URI_python3-samba-dc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-samba-dc-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-samba-dc = "
 python3
 libwbclient
 libldb
 python3-samba
 samba-client-libs
 python3-libs
 libtalloc
 python3-markdown
 glibc
 samba-dc-libs
 python3-talloc
"

URI_samba = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba = "
 samba-client-libs
 cups-libs
 samba-common
 samba-common-libs
 samba-common-tools
 dbus-libs
 samba-dcerpc
 samba-libs
 libtalloc
 libtdb
 libtevent
 openldap
 gnutls
 libwbclient
 pam
 bash
 libldb
 libnetapi
 popt
 glibc
"

URI_samba-client-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-client-libs-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-client-libs = "
 glibc-gconv-extra
 systemd-libs
 samba-common
 krb5-libs
 samba-common-libs
 libacl
 jansson
 libcap
 libcom_err
 libtalloc
 libtasn1
 libtdb
 libtevent
 libtirpc
 openldap
 zlib-ng-compat
 gnutls
 libwbclient
 libxcrypt
 libgcc
 pam-libs
 avahi-libs
 libicu
 libldb
 popt
 glibc
"

URI_samba-common = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-common-4.21.3-113.el10_0.noarch.rpm;unpack=0"
RDEPENDS:samba-common = "
 systemd
 bash
"

URI_samba-common-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-common-libs-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-common-libs = "
 libwbclient
 libldb
 samba-client-libs
 samba-common
 popt
 libtalloc
 libtdb
 glibc
 openldap
"

URI_samba-common-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-common-tools-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-common-tools = "
 python3
 samba-client-libs
 krb5-libs
 samba-common-libs
 samba-ldb-ldap-modules
 samba-libs
 jansson
 libcom_err
 libtalloc
 libtdb
 libtevent
 openldap
 gnutls
 libwbclient
 libldb
 readline
 libnetapi
 popt
 glibc
"

URI_samba-dc-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-dc-libs-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-dc-libs = "
 gnutls
 samba-libs
 libldb
 libwbclient
 samba-client-libs
 libtevent
 samba-common-libs
 libtalloc
 glibc
"

URI_samba-dcerpc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-dcerpc-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-dcerpc = "
 gnutls
 samba-libs
 jansson
 libwbclient
 libldb
 samba-client-libs
 cups-libs
 libtevent
 libnetapi
 samba-common-libs
 popt
 libtalloc
 libtdb
 glibc
 openldap
"

URI_samba-ldb-ldap-modules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-ldb-ldap-modules-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-ldb-ldap-modules = "
 libldb
 libwbclient
 samba-client-libs
 libtevent
 samba-common-libs
 libtalloc
 glibc
 openldap
"

URI_samba-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-libs-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-libs = "
 libldb
 libwbclient
 samba-client-libs
 libtevent
 samba-common-libs
 popt
 libtalloc
 libtdb
 glibc
"

URI_samba-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-tools-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-tools = "
 python3
 python3-samba
 python3-samba-dc
"

URI_samba-usershares = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-usershares-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-usershares = "
 bash
 samba
 samba-common-tools
"

URI_samba-winbind = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-winbind-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-winbind = "
 samba-client-libs
 samba-common
 krb5-libs
 samba-common-libs
 samba-common-tools
 samba-dcerpc
 samba-libs
 libcom_err
 libtalloc
 libtdb
 libtevent
 samba-winbind-modules
 openldap
 gnutls
 libwbclient
 bash
 libldb
 popt
 glibc
"

URI_samba-winbind-modules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/samba-winbind-modules-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-winbind-modules = "
 samba-libs
 libwbclient
 samba-client-libs
 pam
 pam-libs
 libtalloc
 glibc
"

URI_samba-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/samba-client-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-client = "
 libsmbclient
 gnutls
 libarchive
 libldb
 libwbclient
 samba-client-libs
 readline
 libtevent
 samba-common
 krb5-libs
 libcom_err
 bash
 ncurses-libs
 popt
 libtalloc
 glibc
 alternatives
 samba-common-libs
"

URI_samba-gpupdate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/samba-gpupdate-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-gpupdate = "
 python3
 cepces-certmonger
 certmonger
 samba-ldb-ldap-modules
 python3-samba
 python3-samba-dc
"

URI_samba-krb5-printing = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/samba-krb5-printing-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-krb5-printing = "
 samba-client
 samba-client-libs
 krb5-libs
 bash
 glibc
 alternatives
"

URI_samba-vfs-iouring = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/samba-vfs-iouring-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-vfs-iouring = "
 samba-libs
 libldb
 libwbclient
 samba
 samba-client-libs
 libtevent
 libtalloc
 glibc
 liburing
"

URI_samba-winbind-clients = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/samba-winbind-clients-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-winbind-clients = "
 gnutls
 samba-libs
 libwbclient
 libldb
 samba-client-libs
 libtevent
 samba-common
 krb5-libs
 libcom_err
 samba-common-libs
 popt
 libtalloc
 samba-winbind
 glibc
"

URI_samba-winbind-krb5-locator = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/samba-winbind-krb5-locator-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-winbind-krb5-locator = "
 libldb
 libwbclient
 samba-client-libs
 samba-winbind
 bash
 libtalloc
 glibc
 alternatives
"

URI_samba-winexe = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/samba-winexe-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-winexe = "
 libldb
 libwbclient
 samba-client-libs
 libtevent
 samba-common-libs
 popt
 libtalloc
 glibc
"

URI_libldb-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libldb-devel-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libldb-devel = "
 libldb
 pkgconf-pkg-config
 libtalloc-devel
 libtdb-devel
 libtevent-devel
"

URI_libnetapi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnetapi-devel-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnetapi-devel = "
 libnetapi
 pkgconf-pkg-config
"

URI_libsmbclient-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsmbclient-devel-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsmbclient-devel = "
 libsmbclient
 pkgconf-pkg-config
"

URI_libwbclient-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libwbclient-devel-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwbclient-devel = "
 libwbclient
 pkgconf-pkg-config
"

URI_python3-samba-test = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-samba-test-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-samba-test = "
 python3
 python3-samba
 samba-client-libs
 samba-libs
"

URI_samba-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/samba-devel-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-devel = "
 samba-libs
 libldb-devel
 samba-client-libs
 pkgconf-pkg-config
 libnetapi
 samba-devel
 samba-dc-libs
 libtalloc-devel
 libtevent-devel
"

URI_samba-pidl = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/samba-pidl-4.21.3-113.el10_0.noarch.rpm;unpack=0"
RDEPENDS:samba-pidl = "
 perl-libs
 perl-vars
 perl-interpreter
 perl-FindBin
 perl-Parse-Yapp
 perl-Getopt-Long
 perl-File-Basename
 perl-parent
 perl-Exporter
 samba-pidl
 perl-base
 perl-lib
"

URI_samba-test = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/samba-test-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-test = "
 samba-test-libs
 samba
 samba-client-libs
 perl-Archive-Tar
 samba-common
 krb5-libs
 samba-common-libs
 samba-dc-libs
 libsmbclient
 samba-libs
 libcom_err
 samba-winbind
 libtalloc
 libtdb
 libtevent
 gnutls
 libwbclient
 python3-samba
 libldb
 readline
 libnetapi
 popt
 glibc
"

URI_samba-test-libs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/samba-test-libs-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:samba-test-libs = "
 samba-libs
 libldb
 libwbclient
 samba-client-libs
 samba-common-libs
 libtalloc
 glibc
"

URI_ctdb = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ctdb-4.21.3-113.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ctdb = "
 systemd
 iproute
 samba-client-libs
 tdb-tools
 samba-common-libs
 procps-ng
 net-tools
 util-linux
 libtalloc
 libtdb
 libtevent
 libtirpc
 sed
 bash
 ethtool
 gawk
 iptables-nft
 popt
 samba-winbind-clients
 glibc
 coreutils
 psmisc
"
