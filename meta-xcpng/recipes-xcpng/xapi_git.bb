inherit xcp-ng-rpm

# FIXME: update EXTRA_UPSTREAM_RDEPENDS:append:x86_64 when we bump this
SRCREV = "599a7f2224196e2cfd6f35c3727c47a0273f6a4d"
SRCREV:aarch64 = "59073c0986105fae3f348c8ba8293b34c167d783"

# add "noshared" to let git-describe work in the container, for the "-dirty" workaround
BB_GIT_NOSHARED = "1"

DEPENDS += " \
  ocaml \
  xen \
  xs-opam-repo \
  blktap \
  sm \
"

# xapi-core
RDEPENDS += " \
  sm \
  xcp-python-libs \
  vmss \
  xcp-ng-release \
  dmv-utils \
"
# FIXME cannot include without creating a loop.  But cannot do_deploy xapi-core without it.
#  xcp-featured \
#
# obsolete?
#  kpatch \
#

# xenopsd-xc
RDEPENDS += " \
  xcp-ng-generic-lib \
  emu-manager \
  qemu \
  xcp-clipboardd \
"
# FIXME: temporary disabled in ARM while we bootstrap
RDEPENDS:remove:aarch64 = "qemu"

# rrdd-plugins
RDEPENDS += " \
  xen \
"

# *-devel
RDEPENDS += " \
  xs-opam-repo \
"

# ${FEDORA_MIRROR}/releases/
# FIXME? lacks a way to declare missing dep of redhat-lsb on initscripts
EXTRA_UPSTREAM_RDEPENDS = " \
  ${FEDORA_ARCHIVE_MIRROR}/updates/40/Everything/x86_64/Packages/p/python3-opentelemetry-exporter-zipkin-1.25.0-2.fc40.noarch.rpm \
  ${FEDORA_ARCHIVE_MIRROR}/updates/40/Everything/x86_64/Packages/p/python3-opentelemetry-exporter-zipkin-json-1.25.0-2.fc40.noarch.rpm \
  ${FEDORA_ARCHIVE_MIRROR}/updates/40/Everything/x86_64/Packages/p/python3-opentelemetry-exporter-zipkin-proto-http-1.25.0-2.fc40.noarch.rpm \
  ${FEDORA_ARCHIVE_MIRROR}/updates/40/Everything/x86_64/Packages/p/python3-opentelemetry-api-1.25.0-2.fc40.noarch.rpm \
  ${FEDORA_ARCHIVE_MIRROR}/updates/40/Everything/x86_64/Packages/p/python3-opentelemetry-sdk-1.25.0-2.fc40.noarch.rpm \
  ${FEDORA_ARCHIVE_MIRROR}/updates/40/Everything/x86_64/Packages/p/python3-opentelemetry-semantic-conventions-0.46~b0-2.fc40.noarch.rpm \
"

EXTRA_UPSTREAM_RDEPENDS:append:x86-64-v2 = " \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/d/dhcp-client-4.4.3-14.P1.fc41.x86_64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/d/dhcp-common-4.4.3-14.P1.fc41.noarch.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/n/nbd-3.25-5.fc41.x86_64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/s/ssmtp-2.64-37.fc41.x86_64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/r/redhat-lsb-core-5.0-0.11.20231006git8d00acdc.fc41.x86_64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/r/redhat-lsb-5.0-0.11.20231006git8d00acdc.fc41.x86_64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/o/openvswitch-3.4.0-2.fc41.x86_64.rpm \
  ${ALMA_EPEL_MIRROR}/10.2/x86_64_v2/Packages/libcgroup-tools-3.0-10.el10_2.alma_altarch.x86_64_v2.rpm \
  ${ALMA_EPEL_MIRROR}/10.2/x86_64_v2/Packages/libcgroup-3.0-10.el10_2.alma_altarch.x86_64_v2.rpm \
  \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/i/iptables-legacy-1.8.10-15.fc41.x86_64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/i/iptables-legacy-libs-1.8.10-15.fc41.x86_64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/i/iptables-libs-1.8.10-15.fc41.x86_64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/i/iptables-services-1.8.10-15.fc41.noarch.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/x86_64/os/Packages/i/iptables-utils-1.8.10-15.fc41.x86_64.rpm \
"

EXTRA_UPSTREAM_RDEPENDS:append:x86-64-v2 = " \
${ALMA_EPEL_MIRROR}/10.1/x86_64_v2/Packages/jemalloc-5.3.0-10.el10_1.alma_altarch.x86_64_v2.rpm \
"

EXTRA_UPSTREAM_RDEPENDS:append:aarch64 = " \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/d/dhcp-client-4.4.3-14.P1.fc41.aarch64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/d/dhcp-common-4.4.3-14.P1.fc41.noarch.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/n/nbd-3.25-5.fc41.aarch64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/s/ssmtp-2.64-37.fc41.aarch64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/r/redhat-lsb-core-5.0-0.11.20231006git8d00acdc.fc41.aarch64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/r/redhat-lsb-5.0-0.11.20231006git8d00acdc.fc41.aarch64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/s/spax-1.6-15.fc41.aarch64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/o/openvswitch-3.4.0-2.fc41.aarch64.rpm \
  ${EPEL_MIRROR}/10.2/Everything/aarch64/Packages/l/libcgroup-tools-3.0-10.el10_2.aarch64.rpm \
  ${EPEL_MIRROR}/10.2/Everything/aarch64/Packages/l/libcgroup-3.0-10.el10_2.aarch64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/i/iptables-legacy-1.8.10-15.fc41.aarch64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/i/iptables-legacy-libs-1.8.10-15.fc41.aarch64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/i/iptables-libs-1.8.10-15.fc41.aarch64.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/i/iptables-services-1.8.10-15.fc41.noarch.rpm \
  ${FEDORA_MIRROR}/releases/41/Everything/aarch64/os/Packages/i/iptables-utils-1.8.10-15.fc41.aarch64.rpm \
"
