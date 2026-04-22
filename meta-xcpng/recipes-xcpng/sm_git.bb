inherit xcp-ng-rpm

SRCREV = "a977f8c35f481675daf9da1a6a0f070ec1c68362"

DEPENDS = "python-bitarray"

EXTRA_UPSTREAM_DEPENDS = " \
${FEDORA_ARCHIVE_MIRROR}/releases/40/Everything/x86_64/os/Packages/p/python3-mock-4.0.3-12.fc40.noarch.rpm \
"
EXTRA_UPSTREAM_DEPENDS:aarch64 = " \
${FEDORA_ARCHIVE_MIRROR}/releases/40/Everything/aarch64/os/Packages/p/python3-mock-4.0.3-12.fc40.noarch.rpm \
"

RDEPENDS = "xcp-ng-release python-bitarray"

EXTRA_UPSTREAM_RDEPENDS = " \
${ALMA_EPEL_MIRROR}/10.2/x86_64_v2/Packages/libcgroup-tools-3.0-10.el10_2.alma_altarch.x86_64_v2.rpm \
${ALMA_EPEL_MIRROR}/10.2/x86_64_v2/Packages/libcgroup-3.0-10.el10_2.alma_altarch.x86_64_v2.rpm \
"

EXTRA_UPSTREAM_RDEPENDS:aarch64 = " \
${EPEL_MIRROR}/10.2/Everything/aarch64/Packages/l/libcgroup-tools-3.0-10.el10_2.aarch64.rpm \
${EPEL_MIRROR}/10.2/Everything/aarch64/Packages/l/libcgroup-3.0-10.el10_2.aarch64.rpm \
"
